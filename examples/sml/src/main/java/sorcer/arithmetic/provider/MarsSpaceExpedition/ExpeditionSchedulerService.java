package sorcer.arithmetic.provider.MarsSpaceExpedition

import sorcer.service.Context;
import sorcer.service.ContextException;
import java.rmi.RemoteException;

public interface ExpeditionSchedulerService {

    Context createExpeditionPlan(Context context) throws RemoteException, ContextException;

    Context prepareSimulation(Context context) throws RemoteException, ContextException;

    Context launchRocket(Context context) throws RemoteException, ContextException;
}