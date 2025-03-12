<body>
    <h1>Bug Report – Missing Validation in Phone Number Field</h1>
    <h2>Description</h2>
    <p>The <strong>Phone Number</strong> field in the registration form does not enforce proper input validation, allowing users to enter invalid characters, letters, or incorrect formats.</p>
    <h2>Affected Page</h2>
    <ul>
        <li><a href="https://parabank.parasoft.com/parabank/register.htm">Registration Page</a></li>
    </ul>
    <h2>Steps to Reproduce</h2>
    <ol>
        <li>Navigate to the <a href="https://parabank.parasoft.com/parabank/register.htm">Registration Page</a>.</li>
        <li>Enter an invalid phone number, such as <strong>"abc-123-xyz"</strong>, <strong>"+1@345!678"</strong>, or an excessively long number.</li>
        <li>Click the <strong>REGISTER</strong> button.</li>
        <li>The system does not display any validation error and accepts the invalid input.</li>
    </ol>
    <h2>Screenshot</h2>
    <p><img src="Phone-Registration.png" alt="Screenshot showing missing validation in Phone Number field"></p>
    <h2>Expected Behavior</h2>
    <ul>
        <li>The Phone Number field should only accept <strong>numeric values</strong>.</li>
        <li>Letters and special characters (e.g., <strong>"!@#$%^&*()"</strong>) should be <strong>restricted</strong>.</li>
        <li>The system should enforce a <strong>standard phone number format</strong> (e.g., <strong>"(XXX) XXX-XXXX"</strong> or <strong>"+XX XXXXXXXXX"</strong>).</li>
        <li>If an invalid phone number is entered, the system should display an <strong>error message</strong>.</li>
    </ul>
    <h2>Suggested Fix</h2>
    <ul>
        <li>Implement validation to allow only <strong>digits</strong> (0-9).</li>
        <li>Enforce a <strong>character limit</strong> to prevent excessively long or short phone numbers.</li>
        <li>Implement a <strong>format check</strong> to ensure numbers follow the correct pattern.</li>
        <li>Ensure validation is applied <strong>both on the frontend and backend</strong>.</li>
    </ul>
    <h2>Test Environment</h2>
    <ul>
        <li>OS: macOS</li>
        <li>Browser: Google Chrome 134.0.6998.44</li>
    </ul>
</body>