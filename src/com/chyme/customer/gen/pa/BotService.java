//	Generated using Unvired Modeller - Build R-4.000.0002
package com.chyme.customer.gen.pa;

import java.util.Hashtable;
import java.util.Vector;

import com.unvired.chyme.api.ChymeAPI;
import com.unvired.lib.utility.InfoMessage;
import com.unvired.lib.utility.InfoMessage.InfoMessageCategory;
import com.unvired.ump.agent.IBusinessProcess;
import com.unvired.ump.agent.IProcessAgent;
import com.unvired.ump.agent.InvalidOutput;

public abstract class BotService implements IProcessAgent {
	protected Vector<InfoMessage> infoMessages;
	protected IBusinessProcess process;
	protected ChymeAPI chymeAPI;

	public void init(IBusinessProcess process) {
		this.process = process;
		infoMessages = new Vector<InfoMessage>();
		chymeAPI = new ChymeAPI(process);
	}

	public void finish() {
		try {
			process.setOutput(chymeAPI.getBusinessEntityOutput(), null);
		} catch (InvalidOutput e) {
			process.getInfoMessageList().add(new InfoMessage(e.getMessage(), InfoMessageCategory.FAILURE));
		}
	}

	protected void addParameter(Hashtable<String, String> parameters, String name, String value, String defaultValue) {
		if (!isEmpty(name)) {
			if (!isEmpty(value))
				parameters.put(name, value);
			else if (!isEmpty(defaultValue))
				parameters.put(name, defaultValue);
		}
	}

	protected boolean isEmpty(String value) {
		return (value == null || value.trim().isEmpty());
	}

}
