/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author pinpin
 */
public class LiveScoreBean {
    private String someScore;

    public static final String PROP_SOMESCORE = "someScore";
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    
    public String getSomeScore() {
        return someScore;
    }

    public void setSomeScore(String someScore) {
        String oldSomeScore = this.someScore;
        this.someScore = someScore;
        propertyChangeSupport.firePropertyChange(PROP_SOMESCORE, oldSomeScore, someScore);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
}
