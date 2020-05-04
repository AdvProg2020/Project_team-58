package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Product {

    private String id;
    private String currentCondition;
    private HashMap<String,String> commonAttributes;
    private Category category;
    private HashMap<String,String> specificAttributes;
    private String description;
    private float averageScore;
    private ArrayList<Comment> Comments;
    private int quantity;
}
