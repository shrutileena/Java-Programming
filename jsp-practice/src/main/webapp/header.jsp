<!-- <h1 style="background: #0099ff; color: white; padding: 20px;">This is header</h1>
<h1>Usage of directives - Page, Include</h1> -->

<%@page import="java.util.Date"%>
<div style="background: #0099ff; color: white; padding: 20px;">
	<h1>This is header</h1>
	<p>Usage of directives - Page, Include</p>
	<p>Current date is: <%= new Date().toString() %></p>
</div>