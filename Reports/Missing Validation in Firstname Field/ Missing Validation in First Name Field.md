<body>
    <h1>Bug Report – Missing Validation in First Name Field</h1>

    <h2>Description</h2>
    <p>The <strong>First Name</strong> field in the registration form does not enforce proper input validation, allowing users to enter invalid characters, numbers, or incorrect formats.</p>

    <h2>Affected Page</h2>
    <ul>
        <li><a href="https://parabank.parasoft.com/parabank/register.htm">Registration Page</a></li>
    </ul>

    <h2>Steps to Reproduce</h2>
    <ol>
        <li>Navigate to the <a href="https://parabank.parasoft.com/parabank/register.htm">Registration Page</a>.</li>
        <li>Enter an invalid first name, such as <strong>"12345"</strong> or <strong>"@John!"</strong>.</li>
        <li>Click the <strong>REGISTER</strong> button.</li>
        <li>The system does not display any validation error and accepts the invalid input.</li>
    </ol>

    <h2>Screenshot</h2>
    <p><img src="FirstName-Registration.png" alt="Screenshot showing missing validation in First Name field"></p>

    <h2>Expected Behavior</h2>
    <ul>
        <li>The First Name field should only accept <strong>alphabetical characters</strong> (A-Z, a-z).</li>
        <li>Special characters, numbers, and excessive whitespace should be restricted.</li>
        <li>If invalid characters are entered, the system should display an <strong>error message</strong>.</li>
    </ul>

    <h2>Suggested Fix</h2>
    <ul>
        <li>Implement validation to allow only <strong>letters</strong>.</li>
        <li>Restrict <strong>special characters and numbers</strong>.</li>
        <li>Ensure validation is applied <strong>both on the frontend and backend</strong>.</li>
    </ul>

    <h2>Test Environment</h2>
    <ul>
        <li>OS: macOS</li>
        <li>Browser: Google Chrome 134.0.6998.44</li>
    </ul>
</body>