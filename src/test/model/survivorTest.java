package test.model;

import main.model.survivor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class survivorTest {
    survivor s1;
    survivor s2;

    @BeforeEach
    void setup() {
        s1 = new survivor("Mako");
        s2 = new survivor("Saeko");
    }

    @Test
    void testAlterAppealBy() {
        s1.alterAppealBy(30);
        assertEquals(s1.getAppeal(), 30);
        assertEquals(s2.getAppeal(), 0);

        s2.alterAppealBy(101);
        assertEquals(s1.getAppeal(), 30);
        assertEquals(s2.getAppeal(), 100);

        s1.alterAppealBy(-31);
        assertEquals(s1.getAppeal(), 0);
        assertEquals(s2.getAppeal(), 100);
    }

    @Test
    void testAlterRelationshipBy() {
        s1.alterRelationshipBy(30);
        assertEquals(s1.getRelationship(), 30);
        assertEquals(s2.getRelationship(), 0);

        s2.alterRelationshipBy(101);
        assertEquals(s1.getRelationship(), 30);
        assertEquals(s2.getRelationship(), 100);

        s1.alterRelationshipBy(-31);
        assertEquals(s1.getRelationship(), 0);
        assertEquals(s2.getRelationship(), 100);
    }
}
