package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.*;

import java.util.Iterator;

public class SongPlayer {

    public void play(Song song, Instrumento instrumento) {

        Iterator<Nota> notas = song.getSongIterator();
        Piano piano = new Piano();
        Guitarra guitarra = new Guitarra();
        Violin violin = new Violin();
        Flauta flauta = new Flauta();

        while (notas.hasNext()) {
            Nota nota = notas.next();


         instrumento.add(new piano(nota);
         instrumento.add(new flauta(nota);
         instrumento.add(new violin(nota);
         instrumento.add(new guitarra(nota);
            }
        }

    }
}
