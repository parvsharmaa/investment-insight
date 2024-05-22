# Neosurge Investment Insight Backend

## Project Description

This backend system integrates GPT-4 to generate investment insights for the Indian capital market based on user preferences. It is built using Java, Spring Boot, MongoDB, and includes RestAPI for seamless frontend interaction.

## Setup Instructions

1. Clone the repository: `git clone https://github.com/parvsharmaa/neosurge-backend.git`
2. Navigate to the project directory: `cd neosurge-backend`
3. Set up environment variables for the database and API keys.
4. Build the project: `mvn clean install`
5. Run the project: `mvn spring-boot:run`

## Design Choices

- **Java and Spring Boot:** Chosen for robust backend development.
- **MongoDB:** Selected for its flexibility in handling unstructured data.
- **GPT-4 API Integration:** Utilized for generating insightful investment content.

## API Usage

- **Get Insights:** `POST /api/insights` with user input.
- **Save Preferences:** `POST /api/preferences` with user preferences.
- **Get Preferences:** `GET /api/preferences/{userId}`
- **Get Insights by User:** `GET /api/insights/{userId}`
