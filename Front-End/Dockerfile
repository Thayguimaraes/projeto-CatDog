FROM node:18-alpine AS build

WORKDIR /app

COPY . .

RUN npm install

RUN npm run build --prod

FROM node:18-alpine

WORKDIR /usr/app
COPY --from=build /app/dist/catdog/ ./

CMD node ./server/server.mjs
EXPOSE 4000