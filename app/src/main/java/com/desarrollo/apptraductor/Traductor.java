package com.desarrollo.apptraductor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class Traductor extends ViewModel {
    private MutableLiveData<Palabras> traducida = new MutableLiveData<>();
    private ArrayList<Palabras> palabrasArray = new ArrayList<>();

    public LiveData<Palabras> getTraducida(){
        return traducida;
    }

    public void armarArray(){
        Palabras casa = new Palabras("Casa","House",R.drawable.casa);
        Palabras conejito = new Palabras("Conejo","Rabbit",R.drawable.conejito);
        Palabras perro = new Palabras("Perro","Dog",R.drawable.dog);
        Palabras gato = new Palabras("Gato","Cat",R.drawable.gatito);
        Palabras manzana = new Palabras("Manzana","Apple",R.drawable.manzana);
        Palabras nada = new Palabras("nada","nada",R.drawable.nada1);
        palabrasArray.add(casa);
        palabrasArray.add(perro);
        palabrasArray.add(conejito);
        palabrasArray.add(gato);
        palabrasArray.add(manzana);
        palabrasArray.add(nada);
    }

    public void traducir(String cadena){
        armarArray();
        for (int i = 0;i < palabrasArray.size();i++){
            if(cadena.equals(palabrasArray.get(i).getEnEsp())){
                traducida.setValue(palabrasArray.get(i));
            }
        }
    }
}
