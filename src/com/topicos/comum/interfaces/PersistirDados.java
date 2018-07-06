/*
Criado por Gabriel Gageiro;
Data:08/06/18
*/

package com.topicos.comum.interfaces;

import java.util.List;

public interface PersistirDados<T> {

    public T persistir(T objeto);

    public List<T> getObjetos (T objeto);
}
