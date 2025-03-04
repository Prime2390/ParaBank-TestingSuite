<h1>ParaBank-TestingSuite</h1>

<h2>🎯 Project Goal</h2>
<p>The <strong>ParaBank-TestingSuite</strong> project is designed to test the 
<a href="https://parabank.parasoft.com">ParaBank</a> web application. It includes both 
<strong>manual testing</strong> and <strong>automated testing</strong>, verifying key banking system functionalities.</p>

<h3>📌 Main Objectives:</h3>
<ul>
  <li>Verify the correct functioning of banking features such as login, registration, and loan applications.</li>
  <li>Automate tests to improve efficiency and repeatability.</li>
  <li>Document both manual and automated tests in separate directories.</li>
</ul>

<hr>

<h2>🖥️ System Requirements</h2>
<p>To run and develop this project, you need:</p>

<h3>✅ Basic Requirements</h3>
<ul>
  <li><strong>Operating System</strong>: Windows, macOS, or Linux</li>
  <li><strong>Java</strong>: OpenJDK 23.0.2 (recommended)</li>
  <li><strong>Maven</strong>: for dependency management</li>
  <li><strong>Git</strong>: to clone the source code</li>
</ul>

<h3>🔧 Additional Requirements for Automated Tests</h3>
<ul>
  <li><strong>Google Chrome</strong> (or another supported browser)</li>
  <li><strong>Chromedriver</strong> (matching the Chrome version)</li>
  <li><strong>Selenium WebDriver</strong>: for browser automation</li>
  <li><strong>TestNG</strong>: test execution framework</li>
</ul>

<hr>

<h2>📂 Project Structure</h2>
<pre>
ParaBank-TestingSuite/
  ├── ManualTest/         # Documentation and manual test scenarios
  ├── AutomaticTest/      # Automated tests (Selenium + TestNG)
  ├── Reports/            # Test reports (manual and automated)
  ├── .gitignore          # File to ignore unnecessary repository files
  ├── README.md           # This file – main project documentation
</pre>

<p>Each directory contains its own <code>README.md</code> file with more details about its content.</p>