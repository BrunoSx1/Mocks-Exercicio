package test.br.com.sbr;

import dao.ClienteDao;
import dao.ClienteDaoMock;
import dao.IClienteDao;
import org.junit.Assert;
import org.junit.Test;
import services.ClienteService;

public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        char expected;
        Assert.assertEquals( "Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest() {
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        char expected;
        Assert.assertEquals( "Sucesso", retorno);
    }

    @Test
    public void atualizarTest() {
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        char expected;
        Assert.assertEquals( "Sucesso", retorno);
    }

    @Test
    public void excluirTest() {
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        char expected;
        Assert.assertEquals( "Sucesso", retorno);
    }
}