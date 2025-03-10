    <h1>Exploratory Testing Report – HomePage</h1>

    <p><strong>Tester:</strong> Dominik Bernaś</p>
    <p><strong>Tested Area:</strong> HomePage</p>
    <p><strong>Test Environment:</strong></p>
    <ul>
        <li>Operating System: macOS</li>
        <li>Browser: Google Chrome 134.0.6998.44</li>
    </ul>

    <h2>1. Navigation</h2>
    <ul>
        <li>All menu links function correctly.</li>
        <li>Clicking on the logo redirects the user to the homepage.</li>
    </ul>

    <h2>2. Login Form</h2>
    <ul>
        <li>The "Username" and "Password" fields accept input correctly.</li>
        <li>The "LOG IN" button functions as expected.</li>
        <li>If incorrect credentials are entered, the system correctly displays an error message.</li>
    </ul>

    <h2>3. Support Links</h2>
    <ul>
        <li>The "Forgot login info?" link correctly redirects to the password recovery page.</li>
        <li>The "Register" link correctly redirects to the registration page.</li>
    </ul>

    <h2>4. Informational Elements</h2>
    <ul>
        <li>No issues detected. All visible sections present accurate content.</li>
    </ul>

    <h2>5. Responsiveness & Layout</h2>
    <ul>
        <li>The homepage renders correctly on standard screen resolutions.</li>
        <li>Different resolutions were tested in DevTools – no display issues found.</li>
        <li>No overlapping UI elements detected.</li>
    </ul>

    <h2>6. DevTools Console Analysis</h2>
    <p><span style="color: orange; font-weight: bold;">⚠ Warning detected in the browser console:</span></p>
    <ul>
        <li><strong>Message:</strong> "Input elements should have autocomplete attributes (suggested: ‘current-password’)"</li>
        <li><strong>Affected Element:</strong> <code>&lt;input type="password" class="input" name="password"&gt;</code></li>
        <li><strong>Potential Impact:</strong></li>
        <ul>
            <li>Browsers may not remember user passwords, affecting login convenience.</li>
            <li>May impact compliance with best practices for UX and security.</li>
        </ul>
        <li><strong>Recommendation:</strong></li>
        <ul>
            <li>Add the <code>autocomplete="current-password"</code> attribute to the password field if no security policy prevents it.</li>
        </ul>
    </ul>

    <h3>Screenshot:</h3>
    <p><img src=https://github.com/Prime2390/ParaBank-TestingSuite/blob/main/ExploratoryTests/HomePage/screenshot_path.png alt="Console Warning Screenshot"></p>

    <h2>Summary</h2>
    <p>The ParaBank homepage operates as expected in terms of functionality and content display. 
        All primary interactions (navigation, login form, support links) function correctly.</p>
    <p><strong>Identified Issue:</strong> Console warning related to the password field, which may impact user convenience. 
        Further analysis is recommended to assess its effect on security and system usability.</p>

    <h2>Recommendations</h2>
    <ul>
        <li>✅ Add the <code>autocomplete="current-password"</code> attribute to the password field.</li>
        <li>✅ Verify if the omission of this feature aligns with security policies.</li>
    </ul>
</body>
