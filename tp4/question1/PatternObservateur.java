package question1;

public class PatternObservateur extends junit.framework.TestCase {

    public void testNotify() {
        ConcreteSubject list;
        ConcreteObserver observer;

        list = new ConcreteSubject();           // cr�ation d'un "observ�" constitu� d'une liste
        observer = new ConcreteObserver();      // cr�ation d'un observateur
        list.addObserver(observer);             // ajouter cet observateur � la liste
        list.insert("il fait beau, ce matin");  // modification de cette liste, l'observateur doit
                                                // (dervrait) �tre notifi�

        // "v�rification" :
        assertFalse(observer.senders().empty());                            // elle ne doit pas �tre vide,
        assertEquals(list, observer.senders().pop());                       // est-ce le bon �metteur ?
        assertEquals("il fait beau, ce matin", observer.arguments().pop()); // le param�tre re�u est-il correct ?
    }

    // une liste, 2 observateurs
    public void test1() {
        String elm2=" 1 ";
        String elm1="test";
        question1.ConcreteSubject l1 = new question1.ConcreteSubject();
        question1.ConcreteObserver o1 = new question1.ConcreteObserver();
        question1.ConcreteObserver o2 = new question1.ConcreteObserver();
        l1.addObserver(o1);
        l1.addObserver(o2);
        l1.insert(elm1);
        l1.insert(elm2);
        // v�rifier que les deux observateurs ont bien �t� notifi�s avec les
        // bons param�tres

        // � compl�ter !!
        if(o1.senders()!=null)
            assertFalse(o1.senders().empty());
        if(o2.senders()!=null)
            assertFalse(o2.senders().empty());
        if(o1.senders()!=null)
        {
            assertEquals(l1, o1.senders().pop());
            assertEquals(l1, o1.senders().pop()); 
        }
        if(o2.senders()!=null)
        {
            assertEquals(l1, o2.senders().pop());
            assertEquals(l1, o2.senders().pop());
        }
        if(o1.arguments()!=null)
            assertEquals(elm2, o1.arguments().pop());
        if(o2.arguments()!=null)
            assertEquals(elm2, o2.arguments().pop());
        if(o1.arguments()!=null)
            assertEquals(elm1, o1.arguments().pop());
        if(o2.arguments()!=null)
            assertEquals(elm1, o2.arguments().pop());
        // ne pas modifier ces lignes, derni�res assertions vraies de cette
        // m�thode
        assertTrue(o1.senders().empty() && o1.arguments().empty());
        assertTrue(o2.senders().empty() && o2.arguments().empty());
    }

    // deux listes, 1 observateur
    public void test2() 
    {
        String elm1="testA";
        String elm2=" A ";
        String elm3="testB";
        String elm4=" B ";
        
        question1.ConcreteSubject l1 = new question1.ConcreteSubject();
        question1.ConcreteSubject l2 = new question1.ConcreteSubject();

        question1.ConcreteObserver o = new question1.ConcreteObserver();
        l1.addObserver(o);
        l2.addObserver(o);
        l1.insert(elm1);
        l1.insert(elm2);
        l2.insert(elm3);
        l2.insert(elm4);

        // � compl�ter � partir de la ligne 56
        // v�rifier que l'observateur a bien �t� notifi� par les deux listes

        // � compl�ter !!
        if(o.senders()!=null)
        {
            assertEquals(l2, o.senders().pop());
            assertEquals(l2, o.senders().pop());
            assertEquals(l1, o.senders().pop());
            assertEquals(l1, o.senders().pop());
        }
        if(o.arguments()!=null)
        {
            assertEquals(elm4, o.arguments().pop());
            assertEquals(elm3, o.arguments().pop()); 
            assertEquals(elm2, o.arguments().pop());
            assertEquals(elm1, o.arguments().pop()); 
        }
        // ne pas modifier cette ligne, derni�re assertion vraie de cette
        // m�thode
        assertTrue(o.senders().empty() && o.arguments().empty());
    }

    // deux listes, 2 observateurs
    public void test3() {
        question1.ConcreteSubject l1 = new question1.ConcreteSubject();
        question1.ConcreteSubject l2 = new question1.ConcreteSubject();
        question1.ConcreteObserver o1 = new question1.ConcreteObserver();
        question1.ConcreteObserver o2 = new question1.ConcreteObserver();
        l1.addObserver(o1);
        l1.addObserver(o2);
        l2.addObserver(o1);
        l2.addObserver(o2);

        // � compl�ter � partir de la ligne 81
        // v�rifier le bon fonctionnement de countObservers(), de deleteObserver
        // et deleteObservers()

        // � compl�ter !!
        if(l1==null||l2==null)
            return;
        assertTrue(l1.countObservers() == 2);
        assertTrue(l2.countObservers() == 2);
        l1.deleteObserver(o1);
        assertTrue(l1.countObservers() == 1);
        l1.deleteObserver(o2);
        assertTrue(l1.countObservers() == 0);
        l2.deleteObservers();
        assertTrue(l2.countObservers() == 0);
        // ne pas modifier ces lignes, derni�res assertions vraies de cette
        // m�thode
        assertTrue(o1.senders().empty());
        assertTrue(o2.senders().empty());
        assertTrue(l1.countObservers() == 0);
        assertTrue(l2.countObservers() == 0);
    }
}
    
