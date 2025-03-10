<body>
    <h1>Bug Report – Missing autocomplete Attribute in Password Field</h1>

    <h2>Description</h2>
    <p>The password field in the login form does not have the recommended <code>autocomplete="current-password"</code> attribute.</p>

    <h2>Affected Page</h2>
    <ul>
        <li>HomePage: <a href="https://parabank.parasoft.com/parabank/index.htm">ParaBank HomePage</a></li>
    </ul>

    <h2>Steps to Reproduce</h2>
    <ol>
        <li>Open the browser and navigate to the <strong>ParaBank HomePage</strong>.</li>
        <li>Open <strong>DevTools</strong> (F12) and go to the <strong>Console</strong> tab.</li>
        <li>Observe the following warning message:</li>
    </ol>

    <pre>
    [DOM] Input elements should have autocomplete attributes (suggested: "current-password")
    </pre>

    <h2>Expected Behavior</h2>
    <ul>
        <li>The password field should include <code>autocomplete="current-password"</code> to improve user experience and allow browsers to store passwords.</li>
    </ul>

    <h2>Screenshot</h2>
    <p><img src="https://github.com/Prime2390/ParaBank-TestingSuite/blob/main/ExploratoryTests/HomePage/screenshot_path.png" alt="Console Warning Screenshot"></p>

    <h2>Suggested Fix</h2>
    <ul>
        <li>Add <code>autocomplete="current-password"</code> to the password <code>&lt;input&gt;</code> field inside the login form.</li>
    </ul>

    <h2>Test Environment</h2>
    <ul>
        <li>Operating System: macOS</li>
        <li>Browser: Google Chrome 134.0.6998.44</li>
    </ul>

    <h2>Labels</h2>
    <ul>
        <li>Bug</li>
        <li>Enhancement</li>
    </ul>
</body>