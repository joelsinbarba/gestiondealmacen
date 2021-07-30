package com.uaa.gestiondealmacen.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TransaccionDetallePK implements Serializable {

    private long transaccionId;
    private int ordenId;

}
