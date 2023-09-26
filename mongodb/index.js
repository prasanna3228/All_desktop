// code working
const { MongoClient } = require("mongodb");

const uri = "mongodb://127.0.0.1:27017/detail"; //here localhost error coming check and run
const client = new MongoClient(uri);

async function connectToMongo() {
  try {
    await client.connect();
    console.log("Connected to MongoDB");

    // Database and collection name
    const dbName = "use";
    const collectionName = "details";

    // Get a reference to the database
    const db = client.db(dbName);

    // Sample data to insert
    const sampleData = [
      { name: "prasannaaaa", age: 30 },
      { name: "prasan", age: 25 },
      { name: "prasannna", age: 35 },
    ];

    // Insert the sample data into the collection
    const result = await db.collection(collectionName).insertMany(sampleData);

    console.log(`${result.insertedCount} documents inserted`);
  } catch (error) {
    console.error("Error connecting to MongoDB:", error);
  } finally {
    // Close the MongoDB connection when done
    client.close();
  }
}

connectToMongo();
