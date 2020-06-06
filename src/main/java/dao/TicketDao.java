/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import annotations.Column;

/**
 *
 * @author caster
 */
public class TicketDao extends Dao<TicketDao> {
    private static String table = "tickets";
    
    @Column(type = "Number")
    private Number id;
    
    @Column(type = "Number")
    private Number showing_id;
    
    @Column(type = "Number")
    private Number row;
    
    @Column(type = "Number")
    private Number col;
    
    public TicketDao () {
        super(table);
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public Number getShowing_id() {
        return showing_id;
    }

    public void setShowing_id(Number showing_id) {
        this.showing_id = showing_id;
    }

    public Number getRow() {
        return row;
    }

    public void setRow(Number row) {
        this.row = row;
    }

    public Number getCol() {
        return col;
    }

    public void setCol(Number col) {
        this.col = col;
    }   
}
