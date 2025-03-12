<body>
    <h1>Exploratory Testing Report – Registration Page</h1>

    <p><strong>Date:</strong> 10.03.2025</p>
    <p><strong>Tester:</strong> Dominik Bernaś</p>
    <p><strong>Tested Area:</strong> Registration Page</p>
    <p><strong>Test Environment:</strong></p>
    <ul>
        <li>Operating System: macOS</li>
        <li>Browser: Google Chrome 134.0.6998.44</li>
    </ul>

    <h2>1. Navigation</h2>
    <ul>
        <li>The user can access the registration page via the "Register" link on the homepage.</li>
        <li>Clicking the "REGISTER" button correctly redirects to the next step.</li>
    </ul>

    <h2>2. Registration Form</h2>
    <ul>
        <li>All fields are required.</li>
        <li>After filling out the form, the user can successfully complete the registration.</li>
    </ul>

    <h2>3. Field Validation</h2>
    <ul>
        <li>If fields are left empty, the system displays an appropriate message.</li>
        <li><strong>Lack of validation for incorrect data</strong> – the system does not respond to incorrect input formats (e.g., letters in the phone number field, missing "@" in an email address).</li>
        <li><strong>No restrictions on input values</strong> – users can enter both letters and numbers in fields that should be restricted (e.g., phone number, zip code).</li>
        <li><strong>No password strength requirements</strong> – the system accepts weak passwords.</li>
    </ul>

    <h2>4. Error Handling</h2>
    <ul>
        <li>The system does not react to incorrect values in the form.</li>
        <li>If a required field is left blank, the system displays an appropriate validation message.</li>
    </ul>

    <h2>5. Buttons and Interactions</h2>
    <ul>
        <li>The "REGISTER" button functions correctly and registers the user.</li>
        <li>Refreshing the page resets the entered data.</li>
    </ul>

    <h2>6. DevTools Console Analysis</h2>
    <ul>
        <li>No errors were detected in the browser console.</li>
    </ul>

    <h2>Summary</h2>
    <p>The registration form functions correctly but has <strong>significant validation gaps</strong>. 
        The lack of input restrictions and password strength requirements may lead to incorrect data entry and potential issues in future system use.</p>

    <h2>Recommendations</h2>
    <ul>
        <li>Add validation for fields (e.g., phone number should accept only digits, zip code should follow the "XXXXX" format).</li>
        <li>Require users to set stronger passwords (e.g., minimum 8 characters, at least one uppercase letter, one number, and one special character).</li>
        <li>Implement validation checks for email format and other sensitive data.</li>
    </ul>
</body>