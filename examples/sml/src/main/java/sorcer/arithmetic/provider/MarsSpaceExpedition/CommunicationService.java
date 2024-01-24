package sorcer.arithmetic.provider.MarsSpaceExpedition

import sorcer.service.Context;
import sorcer.service.ContextException;
import java.rmi.RemoteException;

public interface CommunicationService {

    Context sendMessage(Context context) throws RemoteException, ContextException;

    Context receiveMessage(Context context) throws RemoteException, ContextException;

    Context createMessage(Context context) throws RemoteException, ContextException;

    Context showMessages(Context context) throws RemoteException, ContextException;

    Context sendParameters(Context context) throws RemoteException, ContextException;
}