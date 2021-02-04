/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 * Main component that realise sistem of convert
 * @author 888Daniel888
 */
public class Exercise {
    
    public static byte[] Encrypt(String text, String keyWord)
    {
        byte[] arr = text.getBytes();
        byte[] key_arr = keyWord.getBytes();
        byte[] resultat = new byte[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            resultat[i] = (byte) (arr[i] ^ key_arr[i % key_arr.length]);
        }
        return resultat;
    }
}
