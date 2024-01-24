package sorcer.arithmetic.provider.MarsSpaceExpedition

import sorcer.service.Context;
import sorcer.service.ContextException;
import java.rmi.RemoteException;

public interface PropulsionSystemsControlService {

    Context monitorEngineHealth(Context context) throws RemoteException, ContextException;

    Context manageFuel(Context context) throws RemoteException, ContextException;

    Context adjustTrajectory(Context context) throws RemoteException, ContextException;

    Context adjustThrust(Context context) throws RemoteException, ContextException;

    Context initiateEmergencyThrustShutdown(Context context) throws RemoteException, ContextException;
}