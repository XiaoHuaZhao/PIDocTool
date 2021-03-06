package com.sap.pi.document.model.util.impl;

import java.util.ArrayList;
import java.util.List;

import com.sap.pi.document.util.impl.DocUtilImp;
import com.sap.pi.document.util.impl.OtherUtil;
import com.sap.pi.document.util.model.CONSTAINTS;
import com.sap.pi.document.util.model.Item;
import com.sap.xi.basis.IntegratedConfiguration;
import com.sap.xi.basis.global.LONGDescription;

public class ICODocUtil {

	public void generateICODoc(IntegratedConfiguration integratedConfiguration, String ICODocName, String ICOName) {

		if (integratedConfiguration != null) {

			DocUtilImp docUtilImp = new DocUtilImp();

			// generate domGroup file of sender
			SenderDocDomGroupUtil senderDocDomGroupUtil = new SenderDocDomGroupUtil();
			senderDocDomGroupUtil.generateSenderDomGroupFile(integratedConfiguration);

			// generate domGroup file of virtual receiver

			// generate domGroup file of logging
			LOGDocDomUtil logDocDomUtil = new LOGDocDomUtil();
			logDocDomUtil.generateLOGDomGroupFile(integratedConfiguration);

			// generate domGroup file of staging
			STGDocDomUtil stgDocDomUtil = new STGDocDomUtil();
			stgDocDomUtil.generateSTGDomGroupFile(integratedConfiguration);

			// generate domGroup file of Inbound Processing
			InboundProcessingDocDomUtil inboundProcessingDocDomUtil = new InboundProcessingDocDomUtil();
			inboundProcessingDocDomUtil.generateInboundProcessingDomGroupFile(integratedConfiguration);

			// generate domGroup file of Receiver Determination
			ReceiverDeterminationDocDomUtil receiverDeterminationDocDomUtil = new ReceiverDeterminationDocDomUtil();
			receiverDeterminationDocDomUtil.generateRDDomGroupFile(integratedConfiguration);

			// generate domGroup file of Outbound Processing
			OutboundProcessingDocDomUtil outboundProcessingDocDomUtil = new OutboundProcessingDocDomUtil();
			outboundProcessingDocDomUtil.generateOutboundProcessingDomGroupFile(integratedConfiguration);

			List<LONGDescription> icoDescriptions = integratedConfiguration.getDescription();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < icoDescriptions.size(); i++) {
				LONGDescription description = icoDescriptions.get(i);
				String descriptionValue = OtherUtil.getValue(description.getValue());
				String descriptionLanguage = OtherUtil.getValue(description.getLanguageCode());
				sb.append(descriptionLanguage + "|" + descriptionValue);
			}

			// generate ICO file
			List<Item> items = new ArrayList<>();
			items.add(new Item("$Main_Value", ICODocName));
			items.add(new Item("$ICO_Value", ICOName));
			items.add(new Item("$DESCRIPTION_Value", OtherUtil.getValue(sb.toString())));
			docUtilImp.generateDocFile(CONSTAINTS.DOCUMENT, items);
		}

	}

}
