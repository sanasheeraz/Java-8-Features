/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventlistenerdemo;

import java.lang.Thread.State;

/**
 *
 * @author Dell
 */
public interface StateChangeListener {
    public void OnStateChange(int a,int b);
}
