package sorcer.sml.arithmetic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sorcer.test.ProjectContext;
import org.sorcer.test.SorcerTestRunner;
import sorcer.arithmetic.provider.Adder;
import sorcer.arithmetic.provider.Multiplier;
import sorcer.arithmetic.provider.Subtractor;
import sorcer.arithmetic.provider.impl.*;
import sorcer.core.context.model.req.Req;
import sorcer.service.Morpher;
import sorcer.core.provider.rendezvous.ServiceJobber;
import sorcer.service.*;
import sorcer.service.modeling.Model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static sorcer.co.operator.*;
import static sorcer.eo.operator.*;
import static sorcer.co.operator.get;
import static sorcer.eo.operator.loop;
import static sorcer.mo.operator.*;
import static sorcer.ent.operator.*;
import static sorcer.so.operator.*;

@RunWith(SorcerTestRunner.class)
@ProjectContext("examples/sml")
public class MarsSpaceExpeditionMograms {
	private final static Logger logger = LoggerFactory.getLogger(MarsSpaceExpeditionMograms.class);

	@Test
	public void arithmeticStructuredBlock() throws Exception {

		Task navigateToADestinationTask = task("navigationTask", sig("navigateToADestination", NavigationSystemService.class),
				context("navigateToADestination", inVal("user/destination"), inVal("user/details"),
						result("block/result", Signature.Direction.IN)));

		Task sendMessage = task("sendMessageTask", sig("sendMessage", CommunicationService.class),
				context("sendMessageTask", inVal("user/message"), inVal("user/message"),
						result("block/response", Signature.Direction.OUT)));


		Block block = block("block", navigateToADestinationTask, sendMessage);

		Block result = exert(block);
		assertEquals(value(context(result), "block/result"), true);
	}

}
	
	
