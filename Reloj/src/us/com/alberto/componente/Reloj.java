package us.com.alberto.componente;

import javafx.application.Platform;
import javafx.scene.Node;
import javafx.scene.control.Label;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

public class Reloj extends Label {

    private int segundos;
    private int minutos;
    private int horas;
    private boolean formato24h;

    public Reloj() {
    }

    public Reloj(String s) {
        super(s);
    }

    public Reloj(String s, Node node) {
        super(s, node);
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public boolean isFormato24f() {
        return formato24h;
    }

    public void setFormato24f(boolean formato24f) {
        this.formato24h = formato24f;
    }

    private void formatoHora() {
        Calendar calendar = new GregorianCalendar();
        if (formato24h) {
            if (horas < 12) {
                setText(horas + " : " + minutos + " : " + segundos + " am");
            }
            setText(horas + " : " + minutos + ": " + segundos + " pm");
        } else {
            horas = calendar.get(calendar.HOUR_OF_DAY);
            setText(horas + " : " + minutos + " : " + segundos);
        }
    }

    private void calcularHora(){
        Calendar calendar = new GregorianCalendar();
        horas = calendar.get(calendar.HOUR);
        segundos = calendar.get(Calendar.SECOND);
        minutos = calendar.get(Calendar.MINUTE);
    }

    public void start() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        calcularHora();
                        formatoHora();
                    }
                });
            }
        }, 1000, 1000); // esperar un segundo en arrancar
    }
}
