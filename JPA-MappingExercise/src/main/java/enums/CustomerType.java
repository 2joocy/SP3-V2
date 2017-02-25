/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 *
 * @author William Pfaffe
 */

public enum CustomerType {
    @Enumerated(EnumType.STRING)
    GOLD,
    SILVER,
    IRON,
    RUSTY
}
