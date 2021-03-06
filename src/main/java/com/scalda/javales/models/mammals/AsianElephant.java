/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scalda.javales.models.mammals;

import com.scalda.javales.models.general.Egg;
import com.scalda.javales.models.general.Gender;
import com.scalda.javales.models.interfaces.IMammal;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author MMarco
 */
public class AsianElephant extends Elephant {

    //Variables
    public static int maxNumberOfEggs = 5;
    private ArrayList<Egg> mammalIEggs = new ArrayList<>();
    private static String[] asianQuotes = {"Toot", "I love math"};

    //Constructor
    public AsianElephant(String bodyCovering, String name, String color, double weight, Gender gender) {
        super(bodyCovering, name, color, weight, maxNumberOfEggs, gender);
    }

    // Getters and setters
    public ArrayList<IMammal> getbabies() {
        return babies;
    }

    // Methods
    public String communicate() {
        Random r = new Random();
        return asianQuotes[r.nextInt(asianQuotes.length)];
    }

}
