package services;

import dao.ClienteDao;
import dao.IClienteDao;
import dao.ClienteDaoMock;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao){
        // clienteDao = new ClientDao();
        this.clienteDao = clienteDao;
    }

    public String salvar(){
        clienteDao.salvar();

        return "Sucesso";
    }


}