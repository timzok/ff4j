import { Ff4jPocUiPage } from './app.po';

describe('ff4j-poc-ui App', () => {
  let page: Ff4jPocUiPage;

  beforeEach(() => {
    page = new Ff4jPocUiPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
