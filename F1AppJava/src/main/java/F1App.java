
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClientSettings;


public class F1App
{

    public static void main(String[] args)
    {
        ConnectionString connString = new ConnectionString(
                "mongodb+srv://<username>:<password>@clusterf1-gof0m.gcp.mongodb.net/test?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connString)
                .retryWrites(true)
                .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("f1");



        MongoCollection<Document> drivers = database.getCollection("drivers");

        // find one document with new Document
        Document student1 = drivers.find(new Document("_id", 1)).first();
        System.out.println("Driver 1: " + student1.toJson());


    }
}
