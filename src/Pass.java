/*
The setKey, lock, and unlock methods take an integer parameter that represents the key.
The setKey method establishes the key. The lock and unlock methods lock and unlock the object, but only if the key used is correct.
The locked method returns true for locked and false if unlocked.
A Lockable object is an object whose regular methods are only accessible if the object is unlocked. If locked the methods cannot be invoked.
Redesign and implement a version of a Die class (like from PigDice) so that it is lockable.
*/
public class Pass implements Lockable{
    private int k;
    private int setKey;
    private boolean locked;

    public Pass(int key){
        k = key;
        locked = false;
    }

    public void setKey(int newKey) {
        newKey = 555;
        setKey = newKey;
        return;
    }

    public void lock(int key) {
        if(k == setKey)
            locked = true;
    }
    public void unlock(int key) {
        if ( k == setKey)
            locked = false;
    }
    public boolean locked() {
        return locked;
    }
    public String toString(){

        if(locked){
            return "locked";
        }
        else{
            return "unlocked";
        }
    }
}