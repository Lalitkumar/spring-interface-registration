# Dynamic bean loading in spring
The application contains code for loading the required bean dynamically. <br />
It is alternative to factory method and if else boler plate code. <br />

- When spring boot application starts, container initialzes all the required beans <br />
  annotated with component, service or repositorty annotations. <br />

- If list of interfaces is autowired, the list contains all the beans those implement that interface. <br />

- This list can be filtered to get required bean dynamically.
