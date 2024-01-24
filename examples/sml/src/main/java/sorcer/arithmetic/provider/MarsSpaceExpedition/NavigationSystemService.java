package sorcer.arithmetic.provider.MarsSpaceExpedition

import sorcer.service.Context;
import sorcer.service.ContextException;
import java.rmi.RemoteException;

public interface NavigationSystemService {

    Context navigateToADestination(Context context) throws RemoteException, ContextException;

    Context countArrivalTime(Context context) throws RemoteException, ContextException;

    Context giveFlightParameters(Context context) throws RemoteException, ContextException;
}