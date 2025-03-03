package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author fausto
 * @version 1.2 03/03/25
 * @see Persona
 */
public class Agenda implements IAgenda {
    private List<Persona> contacts; // Lista de Persona

    /**
     * Constructor de la clase Agenda, donde el Array incialiaza en vacio.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     *
     * @param name Nombre de contacto
     * @param phone Número de telefono agregar
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     *
     * @param name Nombre del contacto a eliminar
     */
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     *
     * @param name  Nombre del contacto.
     * @param oldPhone Número del teléfono que se quiere modificar.
     * @param newPhone Numero nuevo añadir
     */

    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Obtiene la lista de contactos almacenados en la agenda.
     * @return Lista de contacto
     */
    public List<Persona> getContacts() {
        return this.contacts;
    }
}