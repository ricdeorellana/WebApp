This file documents my process in creating my web project, while also acting as a journal to keep track of what I have done.
I will try to keep this file as simple and easy to understand as possible.
To organize this file, I will be using roman numerals for Major Steps and numbers for Minor Steps.
The Goal of this Project is to create a mockup website for my Dad's company.

I - CREATING THE SKELETON
	1. - Starting Point: Controller and Index
		I have create the WebAppController under the Controller pkg which will handle the navigation of the site. 
		I did this because it makes it easy for me to keep track of each addition I make.
		I then made an index.html page to test and ensure that my controller was working.
			- Within this index, I imported Thymeleaf which will be used for further customization.
	
	2. - Further Planning - Database, CSS, JS, Fragments, and HTML
		I decided to create Custom.css and Custom.js in case I necessitate them later.
		After some planning on paper, I made an about and request html page. 
		About.html will display some information on the Company.
		Index.html will display pictures of the company work, some text on company's work, and a button to get a quote
		Request.html will allow a visitor to leave their name, number, email in order to give us a way to contact them. 
			- We will need to store this in a database, so I will be implementing an H2 Database
		I created a Fragments folder
			- With Thymeleaf, I will be able to create fragments for an immutable navbar and footer
		Added nav fragment, will display company name and will link to three html: About, Index, Request
		Added footer fragment, will display company number and address
		Added scipts and headlink fragments for ease of use.
			-Scripts and Headlinks are functioning, tested by implementing a nav into the index.html
			NOTE: I will be further customizing the navbar by the end
			
II - CREATING THE LINKS 
	1. - Formulate the Controller Links to the HTML
		I used a requestmapping annotation in order to get index.
			- The same was done for about and request
			
	2. - Create link between pages in navbar
		Since Navbar will link to these pages, we need to add them to the navbar
		Now that the pages are linked to each other, its time to flesh out the footer 
	3. - The goal of the footer is to display contact info and address of the company. 
		We can experiment in making the footer move with scrolling or not
		I created a fragment for the footer which will let us be flexible once the content of the page is done.
		
		
III - VISION FOR HOME PAGE
	1. - Vision
		The vision for this page is simple
		- There will be a Navbar which will be generalized for all Pages
		- The Top portion will show text that will talk about the Company's types of projects
		- There will be a slideshow carousel beneath 
		- there will be a get a quote button ready for the user
		- Finally, there will be a footer
		- Underneath should be images of the work{SHOULD BE A SLIDESHOW}
		- Underneath of the images will be a QUOTE button
		- A footer will display pertinent info
	2. - Company Text
		The goal of this text is to offer some insight on projects that the company can do
		- Complements images
		
	3. Add a slideshow
		- the following are images I am linking to for the website slideshow
<img src="https://i.ibb.co/k95Rmv8/20200807-164927.jpg" alt="img-0" border="0">
<img src="https://i.ibb.co/tmrMJ9H/img-1.jpg" alt="img-1" border="0">
<img src="https://i.ibb.co/qJ9ZRzv/img-2.jpg" alt="img-2" border="0">
<img src="https://i.ibb.co/1LTBrGk/img-3.jpg" alt="img-3" border="0">
<img src="https://i.ibb.co/ByRrcgT/img-4.jpg" alt="img-4" border="0">
<img src="https://i.ibb.co/FY6fgvW/img-5.jpg" alt="img-5" border="0">
		
	4. Extra padding
		I have included an extra panel beneath the slideshow to pad out the site more
		- This includes a picture that is being linked to it
	5. Added a list beneath in order to ensure individuals know what type of work is done.
	
	6. We will be adding a button for the quote soon!
	
	7. Added a footer element!
		

		