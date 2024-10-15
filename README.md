<h1>Systém pro správu databáze uživatelů</h1>

<p> Tento projekt je ukázkou mých zkušeností v jazyce Java a práci s relačními databázemi pomocí JDBC. 
Aplikace umožňuje správu uživatelů – přidávání, odstraňování a zobrazování všech uživatelů z databáze.</p>

<h2>Funkce</h2>
<ul>
    <li><strong>Přidání nového uživatele:</strong> Umožňuje přidat uživatele do databáze.</li>
    <li><strong>Odstranění uživatele:</strong> Umožňuje odstranit uživatele podle jména a příjmení.</li>
    <li><strong>Zobrazení všech uživatelů:</strong> Vypíše všechny uživatele uložené v databázi s jejich informacemi (id, jméno, příjmení, věk).</li>
</ul>

<h2>Struktura projektu</h2>
<ul>
    <li><strong>DatabaseManager.java:</strong> Třída zajišťuje spojení s databází a obsahuje metody pro manipulaci s daty uživatelů (získávání, přidávání a mazání).</li>
    <li><strong>Manager.java:</strong> Zpracovává uživatelské vstupy a poskytuje metody pro volání funkcí databázového správce.</li>
    <li><strong>Main.java:</strong> Hlavní třída programu, která zobrazuje menu s možnostmi správy uživatelů a zajišťuje běh aplikace.</li>
</ul>
