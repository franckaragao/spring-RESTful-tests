package br.edu.ifpb.mt;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;

import br.edu.ifpb.mt.sdr.repository.AuthorRepository;

/**
 * 
 * 
 * <p>
 * <b> Name </b>
 * </p>
 *
 * <p>
 * Description 
 * </p>
 * 
 * <pre>
 * @see <a href="https://link.reference>Link Reference</a>
 * </pre>
 * 
 * @author <a href="https://github.com/FranckAJ">Franck Aragão</a>
 *
 */
@RunWith(SpringRunner.class)
@RestClientTest(AuthorRepository.class)
public class SpringResTfulTestsApplicationTests {

	@Autowired
	private MockRestServiceServer server;

	@Test
	public void getAuthorsTest() {
		this.server.expect(requestTo("/authors")).andRespond(withSuccess());
	}
}
