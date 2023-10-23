/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientrmi;

import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class ClientRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            IDao<Machine> dao = (IDao<Machine>) Naming.lookup("rmi://localhost:1099/dao");
            IDao<Salle> daoSalle = (IDao<Salle>) Naming.lookup("rmi://localhost:1099/daoSalle");
//            Salle salle = new Salle("B12");
//            daoSalle.create(salle);
//            dao.create(new Machine("Hp", "notebook", 1000, salle));
//            dao.create(new Machine("DEll", "Delll", 70000, salle));
//           dao.create(new Machine("itel", "itel", 8000, salle));

         for (Salle s : daoSalle.findAll()) {
            System.out.println(s);
          }

            for (Machine m : dao.findAll()) {
                System.out.println(m);
            }
//        } catch (NotBoundException ex) {
//            Logger.getLogger(ClientRMI.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (MalformedURLException ex) {
//            Logger.getLogger(ClientRMI.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (RemoteException ex) {
//            Logger.getLogger(ClientRMI.class.getName()).log(Level.SEVERE, null, ex);
//        }
        } catch (NotBoundException ex) {
            Logger.getLogger(ClientRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClientRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientRMI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
