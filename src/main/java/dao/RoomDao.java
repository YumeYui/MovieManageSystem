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
public class RoomDao extends Dao<RoomDao> {
    private static String table = "rooms";
    
    @Column(type = "Number")
    private Number id;
    
    @Column(type = "String")
    private String name;
    
    @Column(type = "Number")
    private Number seats;
    
    @Column(type = "Number")
    private Number rows;
    
    @Column(type = "Number")
    private Number columns;

    public RoomDao () {
        super(table);
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Number getSeats() {
        return seats;
    }

    public void setSeats(Number seats) {
        this.seats = seats;
    }
    
    public Number getRows() {
        return rows;
    }

    public void setRows(Number rows) {
        this.rows = rows;
    }

    public Number getColumns() {
        return columns;
    }

    public void setColumns(Number columns) {
        this.columns = columns;
    }
}
