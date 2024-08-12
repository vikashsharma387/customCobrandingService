

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class customCobrandingService

{
	// ---( internal utility methods )---

	final static customCobrandingService _instance = new customCobrandingService();

	static customCobrandingService _newInstance() { return new customCobrandingService(); }

	static customCobrandingService _cast(Object o) { return (customCobrandingService)o; }

	// ---( server methods )---




	public static final void getBrandingPartnerForCardIssuance (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getBrandingPartnerForCardIssuance)>> ---
		// @sigtype java 3.5
		// [i] field:0:required CustomerGeoLocation
		// [o] field:0:required PartnerAssigned
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	CustomerGeoLocation = IDataUtil.getString( pipelineCursor, "CustomerGeoLocation" );
			String PartnerAssigned = null;
		
		
		if ("USA".equals(CustomerGeoLocation))
		{
			PartnerAssigned="COSCO";
		}
		else if("EU".equals(CustomerGeoLocation))
		{
			PartnerAssigned="SHELL";
		}
		else if("APJ".equals(CustomerGeoLocation))
		{
			PartnerAssigned="HPCL";
		}
		else
		{
			PartnerAssigned="TESCO";
		}
		
		
		
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "PartnerAssigned", PartnerAssigned );
		pipelineCursor_1.destroy();
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

