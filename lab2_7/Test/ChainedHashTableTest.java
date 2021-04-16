import org.junit.Test;

import static org.junit.Assert.*;

public class ChainedHashTableTest {
    @Test
    public void test(){
        ChainedHashTable<Integer, String> chainedHashTable = new ChainedHashTable<>(10, new RemainderHashing());
        chainedHashTable.put(12, "Isabel");
    }
}