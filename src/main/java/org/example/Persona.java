package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Es la clases contacto y una lista de números de telefono
 */
class Persona {
    private String name;
    private List<String> phones;

    /**
     * Creara un contacto con nombre y un número de teléfono inicial.
      * @param name Nombre del contacto
     * @param phone Nombre del telefono a inicializar el contacto
     */

    public Persona(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    /**
     * Obtiene el nombre del contacto
     * @return Nombe del contacto
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtiene la lista de números de telefonos
     * @return lista de números de teléfono
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}