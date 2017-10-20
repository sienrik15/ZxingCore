package com.google.zxing.client.android.services;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by joinnus on 03/10/17.
 */

public class Modelchecking {

    @SerializedName("ok")
    @Expose
    private boolean ok;
    @SerializedName("failed")
    @Expose
    private boolean failed;
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("user")
    @Expose
    private String user;
    @SerializedName("dni")
    @Expose
    private String dni;
    @SerializedName("nameTicket")
    @Expose
    private String nameTicket;
    @SerializedName("position")
    @Expose
    private String position;

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public boolean isFailed() {
        return failed;
    }

    public void setFailed(boolean failed) {
        this.failed = failed;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNameTicket() {
        return nameTicket;
    }

    public void setNameTicket(String nameTicket) {
        this.nameTicket = nameTicket;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Modelchecking{" +
                "ok=" + ok +
                ", failed=" + failed +
                ", msg='" + msg + '\'' +
                ", user='" + user + '\'' +
                ", dni='" + dni + '\'' +
                ", nameTicket='" + nameTicket + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

}
