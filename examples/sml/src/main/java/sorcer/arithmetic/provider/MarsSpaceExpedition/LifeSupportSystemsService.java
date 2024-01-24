package sorcer.arithmetic.provider.MarsSpaceExpedition

import sorcer.service.Context;
import sorcer.service.ContextException;
import java.rmi.RemoteException;

public interface LifeSupportSystemsService {

    Context monitorOxygenLevels(Context context) throws RemoteException, ContextException;

    Context controlCO2Scrubbing(Context context) throws RemoteException, ContextException;

    Context manageWaterRecycling(Context context) throws RemoteException, ContextException;

    Context regulateTemperatureAndHumidity(Context context) throws RemoteException, ContextException;
}