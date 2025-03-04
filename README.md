<h1>ParaBank-TestingSuite</h1>

<h2>🎯 Cel projektu</h2>
<p>Projekt <strong>ParaBank-TestingSuite</strong> służy do testowania aplikacji internetowej 
<a href="https://parabank.parasoft.com">ParaBank</a>. Obejmuje zarówno <strong>testy manualne</strong>, 
jak i <strong>testy automatyczne</strong>, które weryfikują kluczowe funkcjonalności systemu bankowego.</p>

<h3>📌 Główne cele:</h3>
<ul>
  <li>Weryfikacja poprawności działania funkcji bankowych, takich jak logowanie, rejestracja i składanie wniosków o pożyczkę.</li>
  <li>Automatyzacja testów w celu zwiększenia efektywności i powtarzalności testowania.</li>
  <li>Dokumentacja testów manualnych i automatycznych w osobnych katalogach.</li>
</ul>

<hr>

<h2>🖥️ Wymagania systemowe</h2>
<p>Aby uruchomić i rozwijać ten projekt, potrzebujesz:</p>

<h3>✅ Podstawowe wymagania</h3>
<ul>
  <li><strong>System operacyjny</strong>: Windows, macOS lub Linux</li>
  <li><strong>Java</strong>: OpenJDK 23.0.2 (zalecana)</li>
  <li><strong>Maven</strong>: do zarządzania zależnościami</li>
  <li><strong>Git</strong>: do pobrania kodu źródłowego</li>
</ul>

<h3>🔧 Dodatkowe wymagania dla testów automatycznych</h3>
<ul>
  <li><strong>Google Chrome</strong> (lub inna wspierana przeglądarka)</li>
  <li><strong>Chromedriver</strong> (dopasowany do wersji Chrome)</li>
  <li><strong>Selenium WebDriver</strong>: do obsługi testów przeglądarkowych</li>
  <li><strong>TestNG</strong>: framework do uruchamiania testów</li>
</ul>

<hr>

<h2>📂 Struktura katalogów</h2>
<pre>
ParaBank-TestingSuite/
  ├── ManualTest/         # Dokumentacja i scenariusze testów manualnych
  ├── AutomaticTest/      # Testy automatyczne (Selenium + TestNG)
  ├── Reports/            # Raporty testowe (manualne i automatyczne)
  ├── .gitignore          # Plik ignorujący zbędne pliki w repozytorium
  ├── README.md           # Ten plik – główna dokumentacja projektu
</pre>

<p>Każdy katalog zawiera osobny plik <code>README.md</code> z dokładniejszym opisem jego zawartości.</p>