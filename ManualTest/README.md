<h1>📝 ManualTest – Manual Testing</h1>

<h2>🎯 Purpose of the Directory</h2>
<p>The <strong>ManualTest/</strong> directory contains documentation and manual test scenarios for the 
<a href="https://parabank.parasoft.com" target="_blank">ParaBank</a> application. 
These tests are used to manually verify the system's functionality, ensuring its correctness before automation.</p>

<hr>

<h2>📁 Directory Structure</h2>
<pre>
ManualTest/
  ├── TestCases.html      # List of test cases
  ├── README.md           # Directory description and usage instructions
</pre>

<h3>📌 Content Description</h3>
<ul>
  <li><strong><code>TestCases.html</code></strong> – A file containing detailed test scenarios for key application functions.</li>
  <li><strong><code>README.md</code></strong> – Documentation of the directory and instructions for performing tests.</li>
</ul>

<hr>

<h2>🔍 Manual Test Description</h2>
<p>The <strong>TestCases.html</strong> file contains the following groups of manual tests:</p>

<ul>
  <li><strong>🆕 User Registration</strong>
    <ul>
      <li>Verification of the ability to create a new user account.</li>
      <li>Validation of correct and incorrect input data.</li>
    </ul>
  </li>
  <li><strong>🔑 Login</strong>
    <ul>
      <li>Login tests for correct and incorrect credentials.</li>
      <li>Handling failed login attempts.</li>
    </ul>
  </li>
  <li><strong>❓ Forgot Login Info</strong>
    <ul>
      <li>Procedure for recovering a forgotten username and password.</li>
    </ul>
  </li>
  <li><strong>💰 Loan Application</strong>
    <ul>
      <li>Verification of the loan application form.</li>
      <li>Validation checks (e.g., missing data, negative values).</li>
    </ul>
  </li>
  <li><strong>🛠️ Updating User Contact Information</strong>
    <ul>
      <li>Editing and saving new user contact details.</li>
    </ul>
  </li>
</ul>

<hr>

<h2>✅ How to Use the Tests?</h2>
<ol>
  <li><strong>Open the <code>TestCases.html</code> file</strong> in a web browser.</li>
  <li><strong>Follow the described test scenarios</strong> and compare actual results with expected outcomes.</li>
  <li><strong>Document any encountered issues</strong> – if system behavior deviates from expectations, report the issue to the team.</li>
  <li><strong>After testing is complete</strong>, add comments or corrections in the relevant bug tracking system.</li>
</ol>

<hr>

<h2>ℹ️ Final Notes</h2>
<ul>
  <li>Manual tests serve as a foundation for later automation in the <code>AutomaticTest/</code> directory.</li>
  <li>All reported issues should be documented with reproduction steps.</li>
  <li>If you have suggestions for new tests, add them to <code>TestCases.html</code>.</li>
</ul>

<hr>
