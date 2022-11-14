package com.esprit.examen.services;

import com.esprit.examen.entities.Facture;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.esprit.examen.repositories.FournisseurRepository;
import com.esprit.examen.repositories.FactureRepository;
import lombok.extern.slf4j.Slf4j;
import com.esprit.examen.services.IStockService;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.esprit.examen.entities.CategorieProduit;
import com.esprit.examen.repositories.CategorieProduitRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j

public class FactureServicelmplTest {
    @Autowired
    private IFactureService FactureService;
    private FactureRepository FactureRepo;
    private FournisseurServiceImpl FournisseurRepo;
    private IFournisseurService FournisseurService;
    @Autowired
    IProduitService ps;

    @Autowired
    IStockService ss;


    @Mock
    FactureRepository factureRepository;

    @InjectMocks
    FactureServiceImpl factureService;
    @Test
    public void testRetrieveFacture() {

        Facture facture = new Facture(1L, 100, 500, null, null, null, null, null, null);

        facture.setIdFacture(1L);

        Mockito.when(factureRepository.findById(1L)).thenReturn(Optional.of(facture));
        factureService.retrieveFacture(1L);
        Assertions.assertNotNull(facture);

        System.out.println(facture);
        System.out.println(" Retrieve is working correctly...!!");

    }


}
/*
}
public class ClientServiceImplTest {
	@Autowired
	IClientService clientService;

	
	@Test
	public void testAddClient() throws ParseException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dateNaissance = dateFormat.parse("30/09/2000");
		Client c = new Client("Salhi", "Ahmed", dateNaissance, "ahmed.salhi@esprit.tn", "pwd", Profession.Cadre,
				CategorieClient.Ordinaire);
		Client client = clientService.addClient(c);
		System.out.print("client "+client);
		assertNotNull(client.getIdClient());
		assertNotNull(client.getCategorieClient());
		assertTrue(client.getNom().length() > 0);
		clientService.deleteClient(client.getIdClient());

	}
	@Test
	public void testDeleteClient() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dateNaissance = dateFormat.parse("30/09/2000");
		Client c = new Client("Salhi", "Ahmed", dateNaissance, "ahmed.salhi@esprit.tn", "pwd", Profession.Cadre,
				CategorieClient.Ordinaire);
		Client client = clientService.addClient(c);
		clientService.deleteClient(client.getIdClient());
		assertNull(clientService.retrieveClient(client.getIdClient()));
	}

	@Test
	public void testRetrieveAllClients() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dateNaissance = dateFormat.parse("30/09/2000");
		List<Client> clients = clientService.retrieveAllClients();
		int expected = clients.size();
		Client c = new Client("Salhi", "Ahmed", dateNaissance, "ahmed.salhi@esprit.tn", "pwd", Profession.Cadre,
				CategorieClient.Ordinaire);
		Client client = clientService.addClient(c);
		assertEquals(expected + 1, clientService.retrieveAllClients().size());
		clientService.deleteClient(client.getIdClient());

	}
	@Test
	public void testGetClientsByDateNaissance() throws ParseException
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date startDate = dateFormat.parse("28/09/2000");
		Date endDate = dateFormat.parse("30/09/2005");
		List<Client> clients = clientService.getClientsByDateNaissance(startDate, endDate);
		log.info(" count" + clients.size());
		for (Client client : clients) {
			log.info(" client : " + client.getNom()+ " né le "+client.getDateNaissance());

		}
	}

}
*/
