<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Parabank API Tests</title>
</head>
<body>

<h1>🏦 Parabank API Tests</h1>

<h2>📌 Project Description</h2>
<p>This repository contains a collection of API tests for the <strong>ParaBank</strong> application, created in <strong>Postman</strong>. The tests cover key banking operations such as account creation, fund transfers, deposits, withdrawals, and user data management.</p>

<h2>🛠️ Contents</h2>
<ul>
    <li><strong>Authorization Tests:</strong>
        <ul>
            <li>User login</li>
            <li>Fetching user details</li>
        </ul>
    </li>
    <li><strong>Bank Account Tests:</strong>
        <ul>
            <li>Creating a new account</li>
            <li>Retrieving user account list</li>
        </ul>
    </li>
    <li><strong>Banking Operations:</strong>
        <ul>
            <li>Depositing funds</li>
            <li>Withdrawing funds</li>
            <li>Transferring funds between accounts</li>
        </ul>
    </li>
    <li><strong>Loan Operations:</strong>
        <ul>
            <li>Applying for a loan</li>
        </ul>
    </li>
    <li><strong>Database Management:</strong>
        <ul>
            <li>Cleaning the database</li>
            <li>Initializing the database</li>
        </ul>
    </li>
</ul>

<h2>📥 Importing Tests into Postman</h2>
<p>To import the tests into <strong>Postman</strong>, follow these steps:</p>
<ol>
    <li>Download the file <code>Parabank API Tests.postman_collection.json</code> from the repository.</li>
    <li>Open <strong>Postman</strong> and go to the <strong>Collections</strong> tab.</li>
    <li>Click <strong>Import</strong> and select the downloaded file.</li>
    <li>After importing, you can run tests individually or use <strong>Postman Runner</strong>.</li>
</ol>

<h2>🚀 Running the Tests</h2>
<p>Tests can be executed manually or in automation mode:</p>
<ul>
    <li><strong>Manual Testing:</strong> Select a test from the collection and click <strong>Send</strong>.</li>
    <li><strong>Automated Testing:</strong> Use <strong>Postman Runner</strong> to run the entire collection.</li>
</ul>

<h2>📝 Requirements</h2>
<ul>
    <li>Latest version of <strong>Postman</strong></li>
    <li>Test account on <a href="https://parabank.parasoft.com" target="_blank">ParaBank</a></li>
    <li>Configured <strong>environment variables</strong> for test data</li>
</ul>

<h2>🔧 Environment Variable Configuration</h2>
<p>Before running the tests, set up the following environment variables in Postman:</p>
<ul>
    <li><code>host</code> → <code>https://parabank.parasoft.com/parabank/services/bank</code></li>
    <li><code>customerId</code> → ID of the logged-in user</li>
    <li><code>MainAccountId</code> → ID of the user’s main account</li>
    <li><code>SavingsAccountId</code> → ID of the user’s savings account</li>
</ul>

<h2>📌 Author</h2>
<p><strong>Dominik Bernaś</strong></p>

<h2>⚠️ Notes</h2>
<ul>
    <li>The tests are executed on the <strong>ParaBank test environment</strong>, so data may reset.</li>
    <li>If tests are not working properly, ensure that you have an active test account and correct variable values.</li>
</ul>

<p>📌 <strong>Want to contribute?</strong> Feel free to make a <strong>pull request</strong>! 🎉</p>

</body>
</html>