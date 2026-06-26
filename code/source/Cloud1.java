

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class Cloud1

{
	// ---( internal utility methods )---

	final static Cloud1 _instance = new Cloud1();

	static Cloud1 _newInstance() { return new Cloud1(); }

	static Cloud1 _cast(Object o) { return (Cloud1)o; }

	// ---( server methods )---




	public static final void sleepTime (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(sleepTime)>> ---
		// @sigtype java 3.5
		// [i] field:0:required time
		IDataCursor pipelineCursor = pipeline.getCursor();
		   String	timetoSleep = IDataUtil.getString( pipelineCursor, "time" );
		    if (timetoSleep != null && timetoSleep.trim().length() > 0)
		    	timetoSleep=timetoSleep;
		    else
		    	timetoSleep = "10";
		    try
		    {
		    Thread.sleep(Long.parseLong(timetoSleep));
		    }
		    catch(Exception e)
		    {
		    	
		    }
		   pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

