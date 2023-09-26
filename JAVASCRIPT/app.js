// app.js
const express = require('express');
const path = require('path');
const app = express();

const port = 3004;

// Set up static file serving from the 'public' folder
app.use(express.static(path.join(__dirname, 'public')));

// Route to serve the form.html
app.get('/', (req, res) => {
    res.sendFile('form.html');
});

// Route to handle form submission
app.post('/submit', (req, res) => {
    // Handle form submission here
    // For example, you can access form data using req.body
    console.log(req.body);
    res.send('Form submitted successfully!');
});

// Start the server
app.listen(port, () => {
    console.log(`Server running on http://localhost:${port}`);
});
