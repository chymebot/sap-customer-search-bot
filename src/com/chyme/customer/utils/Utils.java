package com.chyme.customer.utils;

import java.util.Vector;

import com.unvired.chyme.api.ChymeAPI;
import com.unvired.chyme.api.ChymeAPI.ResultStatus;
import com.unvired.chyme.api.Message;
import com.unvired.lib.utility.InfoMessage;
import com.unvired.lib.utility.InfoMessage.InfoMessageCategory;
import com.unvired.lib.utility.InfoMessage.InfoMessageType;

public class Utils {

	public static final long FLAG_COMMAND_ERROR = 1;
	public static final long FLAG_NO_FOLLOWUP_COMMAND = 2;
	public static final long FLAG_GROUP_BE = 4;

	public static final String SERVER_DATE_FORMAT = "yyyy-MM-dd";
	public static final String DATE_FORMAT_FOR_DISPLAY = "dd-MMM-yyyy";

	public static final String SAP_CONNECTION_ERROR = "I am sorry! The SAP system is not available right now to get this done. You may try after sometime. If its re-occuring, please contact your administrator.\nIssue Detail: $ERROR$. ";
	public static final String TECHNICAL_ERROR = "I am sorry! Some technical issues and I am not able to get this done. You may try again. If its re-occuring, please contact your administrator.\nIssue Detail: $ERROR$.";
	
	public static String getTruncatedMessage(String mesg) {
		String m = "";
		if (mesg != null && mesg.length() > 120) {
			m = mesg.substring(0, 119) + " ...";
		} else {
			m = mesg;
		}
		return m;
	}

	public static void handleError(final ChymeAPI chymeAPI, final Throwable e, final Vector<InfoMessage> infoMessages) {
		String msg = e.getMessage() != null ? e.getMessage() : e.getClass().getName();
		if (!(e instanceof CustomError)) {
			msg = TECHNICAL_ERROR.replace("$ERROR$", msg);
		} else {
			msg = e.getMessage();
		}
		chymeAPI.setResultStatus(ResultStatus.RETRY);
		chymeAPI.setMessage(new Message(msg, "", Message.FLAG_COMMAND_ERROR | Message.FLAG_NO_FOLLOWUP_COMMAND));
		e.printStackTrace();
		infoMessages.add(new InfoMessage(msg, InfoMessageType.APPLICATION, InfoMessageCategory.FAILURE));
	}

	public static void checkforInfoMessages(Vector<InfoMessage> infoMessages) {		
		if (infoMessages != null && infoMessages.size() > 0) {
			for (InfoMessage infoMessage : infoMessages) {
				if (infoMessage.getCategory().equals(InfoMessageCategory.FAILURE)) {
					String msg = infoMessage.getMessage();
					if (msg.contains("JCO_ERROR_COMMUNICATION"))
						msg = SAP_CONNECTION_ERROR.replace("$ERROR$", Utils.getTruncatedMessage(msg));
					throw new CustomError(msg);
				}
			}
		}
	}
}